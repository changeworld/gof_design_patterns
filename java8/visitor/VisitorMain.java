public class VisitorMain {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            VisitorDirectory rootdir = new VisitorDirectory("root");
            VisitorDirectory bindir = new VisitorDirectory("bin");
            VisitorDirectory tmpdir = new VisitorDirectory("tmp");
            VisitorDirectory usrdir = new VisitorDirectory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new VisitorFile("vi", 10000));
            bindir.add(new VisitorFile("latex", 20000));
            rootdir.accept(new ListVisitor());
            System.out.println("");
            System.out.println("Making user entries...");
            VisitorDirectory aida = new VisitorDirectory("aida");
            VisitorDirectory baba = new VisitorDirectory("baba");
            VisitorDirectory chiyoda = new VisitorDirectory("chiyoda");
            usrdir.add(aida);
            usrdir.add(baba);
            usrdir.add(chiyoda);
            aida.add(new VisitorFile("diary.html", 100));
            aida.add(new VisitorFile("helloworld.java", 200));
            baba.add(new VisitorFile("memo.txt", 300));
            baba.add(new VisitorFile("member.xlsx", 400));
            chiyoda.add(new VisitorFile("business.mail", 500));
            rootdir.accept(new ListVisitor());
        } catch (VisitorFileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
