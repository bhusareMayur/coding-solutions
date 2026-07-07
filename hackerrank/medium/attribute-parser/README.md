# Attribute Parser

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

This challenge works with a custom-designed markup language *HRML*. In *HRML*, each element consists of a starting and ending tag, and there are attributes associated with each tag. Only starting tags can have attributes. We can call an attribute by referencing the tag, followed by a tilde, '`~`' and the name of the attribute. The tags may also be nested.    

The _opening tags_ follow the format: 

`<tag-name attribute1-name = "value1" attribute2-name = "value2" ...>`

The _closing tags_ follow the format:

`</tag-name>`  

The attributes are referenced as:

	tag1~value  
	tag1.tag2~name

Given the source code in HRML format consisting of $N$ lines, answer $Q$ queries. For each query, print the value of the attribute specified. Print _"Not Found!"_ if the attribute does not exist.  

**Example**     
```text
HRML listing
<tag1 value = "value">
<tag2 name = "name">
<tag3 another="another" final="final">
</tag3>
</tag2>
</tag1>

Queries
tag1~value
tag1.tag2.tag3~name
tag1.tag2~value
```

Here, tag2 is nested within tag1, so attributes of tag2 are accessed as `tag1.tag2~<attribute>`.  Results of the queries are:

```text
Query                 Value
tag1~value            "value"
tag1.tag2.tag3~name   "Not Found!"
tag1.tag2.tag3~final  "final"
```

**Input Format**

The first line consists of two space separated integers, $N$ and $Q$. $N$ specifies the number of lines in the HRML source program. $Q$ specifies the number of queries.

The following $N$ lines consist of either an opening tag with zero or more attributes or a closing tag.  There is a space after the tag-name, attribute-name, '=' and value.There is no space after the last value. _If there are no attributes there is no space after tag name._  

$Q$ queries follow. Each query consists of string that references an attribute in the source program.More formally, each query is of the form  $tag_{i_1}.tag_{i_2}.tag_{i_3}....tag_{i_m}$~${attr-name}$ where $m>=1$ and $tag_{i_1},tag_{i_2}...tag_{i_m}$ are valid tags in the input.



**Constraints**

- $1\le N \le 20$  
- $ 1 \le Q \le 20$  
- Each line in the source program contains, at most, $200$ characters.  
- Every reference to the attributes in the $Q$ queries contains at most $200$ characters.  
- All tag names are unique and the HRML source program is logically correct, i.e. valid nesting.
- A tag can may have no attributes.

**Output Format**

Print the value of the attribute for each query. Print "*Not Found!*" without quotes if the attribute does not exist.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-07T15:05:58.906Z  

```cpp
#include <iostream>
#include <sstream>
#include <map>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

struct Tag {
    string name;
    map<string, string> attributes;
    vector<Tag*> children;
    Tag* parent;

    Tag(string n, Tag* p = nullptr) : name(n), parent(p) {}
};

Tag* parse_hrml(vector<string>& lines) {
    Tag* root = new Tag("root");
    Tag* current = root;

    for (const auto& line : lines) {
        if (line[1] == '/') {  // Closing tag
            current = current->parent;
        } else {  // Opening tag
            istringstream iss(line.substr(1, line.size() - 2));
            string tag_name;
            iss >> tag_name;

            Tag* new_tag = new Tag(tag_name, current);
            current->children.push_back(new_tag);

            string attr_name, equals, value;
            while (iss >> attr_name >> equals >> value) {
                value = value.substr(1, value.size() - 2);  // Remove quotes
                new_tag->attributes[attr_name] = value;
            }

            current = new_tag;
        }
    }

    return root;
}

string query_attribute(Tag* root, const string& query) {
    istringstream iss(query);
    string token;
    vector<string> path;

    while (getline(iss, token, '.')) {
        path.push_back(token);
    }

    string attr_name = path.back().substr(path.back().find('~') + 1);
    path.back() = path.back().substr(0, path.back().find('~'));

    Tag* current = root;
    for (const auto& tag : path) {
        auto it = find_if(current->children.begin(), current->children.end(),
                          [&tag](const Tag* t) { return t->name == tag; });
        if (it == current->children.end()) {
            return "Not Found!";
        }
        current = *it;
    }

    auto it = current->attributes.find(attr_name);
    if (it != current->attributes.end()) {
        return it->second;
    }

    return "Not Found!";
}

int main() {
    int n, q;
    cin >> n >> q;
    cin.ignore();

    vector<string> hrml_lines(n);
    for (int i = 0; i < n; i++) {
        getline(cin, hrml_lines[i]);
    }

    Tag* root = parse_hrml(hrml_lines);

    for (int i = 0; i < q; i++) {
        string query;
        getline(cin, query);
        cout << query_attribute(root, query) << endl;
    }

    return 0;
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/attribute-parser/problem)