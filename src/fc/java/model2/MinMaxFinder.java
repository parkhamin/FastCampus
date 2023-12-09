package fc.java.model2;

public class MinMaxFinder {
    private MinMaxFinder(){ } // 객체 생성 막기 -> 클래스이름.메서드이름 으로만 호출 가능!
    public static int findMin(int[] arr){ // 클래스 안에 static 멤버를 가지고 있는 메서드는 객체 생성 없이 호출 가능하다.
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
