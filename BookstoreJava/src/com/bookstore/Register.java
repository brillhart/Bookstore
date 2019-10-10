public static Register {
    public static void main(String[] args) {
        Book twoCities = new Book ("A Tale of Two Cities", "Charles Dickens", "7.99");
        Book hamlet = new Book ("Hamlet", "William Shakespeare", "3.99");

        Purchase purchase = new Purchase();
        purchase.buy(twoCities);
        purchase.but(hamlet);

        System.out.println(purchase);

    }
}
