import java.util.Scanner;

public class Toy {
        private int code;
        private String group;
        private String manufact;
        private int year;
        public Toy(int code, String group, String manufact,int year){
            this.code = code;
            this.group = group;
            this.manufact = manufact;
            this.year = year;
        }
        public Toy(){
            code=0;
            group="NA";
            manufact="NA";
            year=0;
        }
        public int setCode(){
            return code;
        }public String setGroup(){
        return group;
    }public String setManufact(){
        return manufact;
    }public int setYear() {
        return year;}
        public int getCode(){
            return code;}
        public String getGroup(){
            return group;}
        public String getManufact(){
            return manufact;}
        public int getYear() {
            return year;
        }public String toString() {
    return code + "\n" + group + "\n" + manufact + "\n" + year;
}
    //FROM HERE ITS THE CODE FOR THE MAIN
//Scanner input = new Scanner(System.in);
    //              System.out.println("Enter the code, group, manufact and the year: ");
Toy toy = new Toy();
Toy [] arr = new Toy[8];
    //int[] code = new int[8];
    //String []group = new String[8];
    //String[]manufact = new String[8];

//int []year = new int[8];
    //    for(int i=0;i<arr.length;i++){
    //code[i]= input.nextInt();
    //group[i]= input.nextLine();
    //manufact[i]= input.nextLine();
    //year[i]= input.nextInt();
    //              System.out.println(code[i]+", "+group[i]+", "+manufact[i]+", "+year[i]);
                }
