class Array_java{
    public static void main(String[] args){
        int arr[] = new int[10]; //integer array created
        int i;
        for(i=0;i<args.length;i++){
            arr[i] = Integer.parseInt(args[i]);     
    }
    int l = arr.length;
    //sort the array
    for(int j=0;j<l;j++){
        for(int k =j+1;k<l;k++){
            if(arr[j] > arr[k]){
            int temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;
    }
}
}
//print the sorted array
for(i=0;i<args.length;i++){
System.out.println(arr[i]);
}
String grades[] = new String[i];
