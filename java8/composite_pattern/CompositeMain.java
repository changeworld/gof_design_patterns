public class CompositeMain {
  public static void main(String[] args) {
    try {
      System.out.println("Make root directories...");
      Directory rootdir = new Directory("root");
      Directory bindir = new Directory("bin");
      Directory tmpdir = new Directory("tmp");
      Directory usrdir = new Directory("usr");
      rootdir.add(bindir);
      rootdir.add(tmpdir);
      rootdir.add(usrdir);
      bindir.add(new File("test", 10000));
      bindir.add(new File("hoge", 20000));
      rootdir.printList();

      System.out.println("");
      System.out.println("Make user directories...");
      Directory hogehoge = new Directory("hogehoge");
      Directory hugahuga = new Directory("hugahuga");
      Directory piyopiyo = new Directory("piyopiyo");
      usrdir.add(hogehoge);
      usrdir.add(hugahuga);
      usrdir.add(piyopiyo);
      hogehoge.add(new File("diary.html", 100));
      hogehoge.add(new File("Composite.java", 200));
      hugahuga.add(new File("memo.txt", 300));
      piyopiyo.add(new File("game.doc", 400));
      piyopiyo.add(new File("junk.mail", 500));
      rootdir.printList();
    } catch (FileTreatmentException e) {
      e.printStackTrace();
    }
  }
}
