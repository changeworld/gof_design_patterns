public class VisitorMain {
  public static void main(String[] args) {
    try {
      System.out.println("Making root entries...");
      Directory rootdir = new Directory("root");
      Directory bindir = new Directory("bin");
      Directory tmpdir = new Directory("tmp");
      Directory usrdir = new Directory("usr");
      rootdir.add(bindir);
      rootdir.add(tmpdir);
      rootdir.add(usrdir);
      bindir.add(new File("vi", 10000));
      bindir.add(new File("latex", 20000));
      rootdir.accept(new ListVisitor());
      System.out.println("");
      System.out.println("Making user entries...");
      Directory aida = new Directory("aida");
      Directory baba = new Directory("baba");
      Directory chiyoda = new Directory("chiyoda");
      usrdir.add(aida);
      usrdir.add(baba);
      usrdir.add(chiyoda);
      aida.add(new File("diary.html", 100));
      aida.add(new File("helloworld.java", 200));
      baba.add(new File("memo.txt", 300));
      baba.add(new File("member.xlsx", 400));
      chiyoda.add(new File("business.mail", 500));
      rootdir.accept(new ListVisitor());
    } catch (FileTreatmentException e) {
      e.printStackTrace();
    }
  }
}
