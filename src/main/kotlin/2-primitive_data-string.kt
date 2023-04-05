fun main() {
    // data types
    var char: Char = 'O';
    var name: String = "Halim";
    var paragraph: String = """
        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
    """.trimIndent();

    // concat string
    var fullname: String = name + " " + name;

    // string template
    var fullname2: String = "$name $name";
    var fullname3: String = "$name ${name.uppercase()}";

    // string function
    var upperCase: String = name.uppercase();
    var trimParagraph: String = paragraph.trimIndent();
}