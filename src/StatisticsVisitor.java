public class StatisticsVisitor implements Visitor{


    private int numberOfParagraphs=0;
    private int numberofImages=0;
    private int numberOfTables=0;
    @Override
    public void visitBook(Book book) {


    }

    @Override
    public void visitSection(Section section) {

    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        numberOfParagraphs++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {

    }

    @Override
    public void visitImage(Image image) {
        numberofImages++;

    }

    @Override
    public void visitTable(Table table) {
        numberOfTables++;
    }

    public void printStatistics(){
        System.out.println("Number of paragraphs: " + numberOfParagraphs);
        System.out.println("Number of images: " + numberofImages);
        System.out.println("Number of tables: " + numberOfTables);
    }
}
