class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder id = new StringBuilder();

        for (int i = 0; i < identifier.length(); i++) {
            switch (identifier.charAt(i)) {

                case ' ':
                    id.append('_');
                    break;
                case '-':
                    i++;
                    id.append(Character.toUpperCase(identifier.charAt(i)));
                    break;
                case '4':
                    id.append('a');
                    break;
                case '3':
                    id.append('e');
                    break;
                case '0':
                    id.append('o');
                    break;
                case '1':
                    id.append('l');
                    break;
                case '7':
                    id.append('t');
                    break;
                default:
                    if (Character.isLetter(identifier.charAt(i))) {
                        id.append(identifier.charAt(i));
                    }
                    break;
            }
        }
        return id.toString();
    }
}
