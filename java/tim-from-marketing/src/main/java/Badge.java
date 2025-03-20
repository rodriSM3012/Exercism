class Badge {
    public String print(Integer id, String name, String department) {
        String s = "";
        if (id != null) {
            s = "[" + id.toString() + "] - ";
        }
        s = s + name;
        if (department != null) {
            s = s + " - " + department.toUpperCase();
        } else {
            s = s + " - OWNER";
        }
        return s;
    }
}
