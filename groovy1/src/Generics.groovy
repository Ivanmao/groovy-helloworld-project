class Generics {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<Integer>()
        ints.add(1)
        ints.add(2)
        ints.add("hello")

        for (ele in ints) {
            println ele
        }
    }
}
