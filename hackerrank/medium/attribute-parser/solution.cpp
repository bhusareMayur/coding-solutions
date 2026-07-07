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
