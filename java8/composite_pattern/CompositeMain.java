public class CompositeMain {
    public static void main(String[] args) {
        try {
            System.out.println("Make root directories...");
            CompositeDirectory rootdir = new CompositeDirectory("root");
            CompositeDirectory bindir = new CompositeDirectory("bin");
            CompositeDirectory tmpdir = new CompositeDirectory("tmp");
            CompositeDirectory usrdir = new CompositeDirectory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new CompositeFile("test", 10000));
            bindir.add(new CompositeFile("hoge", 20000));
            rootdir.printList();

            System.out.println("");
            System.out.println("Make user directories...");
            CompositeDirectory hogehoge = new CompositeDirectory("hogehoge");
            CompositeDirectory hugahuga = new CompositeDirectory("hugahuga");
            CompositeDirectory piyopiyo = new CompositeDirectory("piyopiyo");
            usrdir.add(hogehoge);
            usrdir.add(hugahuga);
            usrdir.add(piyopiyo);
            hogehoge.add(new CompositeFile("diary.html", 100));
            hogehoge.add(new CompositeFile("Composite.java", 200));
            hugahuga.add(new CompositeFile("memo.txt", 300));
            piyopiyo.add(new CompositeFile("game.doc", 400));
            piyopiyo.add(new CompositeFile("junk.mail", 500));
            rootdir.printList();
        } catch (CompositeFileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
