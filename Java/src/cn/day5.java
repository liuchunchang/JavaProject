package cn;

public class day5 implements Runnable {
    Thread student,teacher;
    day5(){
        teacher =new Thread(this);
        student=new Thread(this);
        teacher.setName("王教授");
        student.setName("张兰");
    }
    @Override
    public void run() {
              if (Thread.currentThread()==student){
                  try{
                      System.out.println(student.getName()+"正在睡觉，不听话");
                      Thread.sleep(1000*60*60);
                  } catch (Exception e) {
//                      e.printStackTrace();
//                      System.out.println(e);
                      System.out.println(student.getName()+"被老师叫醒了");
                  }
                  System.out.println(student.getName()+"开始听课");

              }else if (Thread.currentThread()==teacher){
                  for (int i=1;i<=3;i++){
                      System.out.println("上课");
                      try{
                          Thread.sleep(1000);
                      } catch (InterruptedException e) {
                          e.printStackTrace();
                      }
                  }
                  student.interrupt();
              }
    }
}
