public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Divergent");
        Author author1 = new Author("Veronica Rooth");

        book1.addAuthor(author1);
        try {
            int indexCap1 = book1.createChapter("Capitolul 1");
            Chapter c1 = book1.getChapter(indexCap1);
            int indexSubcap1 = c1.createSubchapter("Subcapitolul 1.1");
            Subchapter sc1 = c1.getSubchapter(indexSubcap1);


            sc1.createNewParagraph("Paragraf 1");
            sc1.createNewParagraph("Paragraf 2");
            sc1.createNewImage("Imagine 1");
            sc1.createNewParagraph("Paragraf 3");
            sc1.createNewTable("Tabel 1");

            sc1.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}