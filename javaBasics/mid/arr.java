public class arr {
    public static void main(String [] args){
        String[] arr = new String[6];

        arr[0]="1";
        arr[1]="2";
        arr[2]="3";
        arr[3]="4";
        arr[4]="5";
        arr[4]="Cactus";
        
        
        System.out.println(arr[3]);
        for(int i = 0; i<arr.length; i++){
            System.out.println("In index "+i+"is "+arr[i]);
        }
    }
}
