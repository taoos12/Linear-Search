public class SearchInRangeSTR {
    public static void main(String[] args) {
        String name = "Hippopotameous";
        char target = 'o';
        System.out.println(searchInRange(name, target, 3, 9));
    }   
    
    public static boolean searchInRange(String str, char target, int start, int end){
        if(str.length() == 0){
            return false;
        }

        for(int i = start; i <= end; i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
