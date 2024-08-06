class PaperRunner {
    public static void main(String[] values) {
        Paper paper = new Paper(1.0);
        paper.size = 10;
        paper.quality = "High";
        paper.color = "White";
        paper.display();

        Paper paper1 = new Paper(0.5);
        paper1.size = 12;
        paper1.quality = "Medium";
        paper1.color = "black";
        paper1.display();

        Paper paper2 = new Paper(1.2);
        paper2.size = 8;
        paper2.quality = "good";
        paper2.color = "blue";
        paper2.display();
    }
}
