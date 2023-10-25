package ChibuzorAssignment;

import java.util.ArrayList;

public class MyStringBuilder {
    private StringBuilder stringBuilder;
    private static ArrayList<String> listStore;

    public MyStringBuilder() {
        stringBuilder = new StringBuilder();
        listStore = new ArrayList<>();

    }

    public static void main(String[] args) {
        MyStringBuilder builder = new MyStringBuilder();
        builder.appends("how are you doing");
        System.out.println(builder);
        builder.delete(12,17);
        System.out.println(builder);
        builder.insert(12,"dear");
        System.out.println(builder);
        builder.replace(12,16,"baby girl");
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
        System.out.println();
        builder.undo();
        System.out.println(builder);
        builder.undo();
        System.out.println(builder);
        builder.undo();
        System.out.println(builder);
        builder.undo();
        System.out.println(builder);
    }

    public StringBuilder appends(String str) {
     String hold = String.valueOf(stringBuilder.append(str));
     listStore.add(hold);
     return new StringBuilder(hold);
    }

   public StringBuilder delete(int start,int end){
        String hold = String.valueOf(stringBuilder.delete(start,end));
        listStore.add(hold);
        return new StringBuilder(hold);

   }
   public StringBuilder insert(int offset, String str){
       String hold = String.valueOf(stringBuilder.insert(offset,str));
       listStore.add(hold);
       return new StringBuilder(hold);
   }
   public StringBuilder replace(int start,int end, String str){
       String hold = String.valueOf(stringBuilder.replace(start,end,str));
       listStore.add(hold);
       return new StringBuilder(hold);
   }
   public StringBuilder reverse(){
       String hold = String.valueOf(stringBuilder.reverse());
       return new StringBuilder(hold);
   }

   public StringBuilder undo(){
        if (!listStore.isEmpty()){
            String undo = listStore.remove(listStore.size()-1);
            stringBuilder = new StringBuilder(undo);
        }
        else {
            return null;
        }
        return stringBuilder;
   }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
