package view;

import java.util.*;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    //차이름 입력 메소드
    public static Map<String, Integer> readCarNames(){
        try{
            Map<String, Integer> cars = new HashMap<>();
            System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
            String line = scanner.nextLine();
            String[] str = line.split(",");
            for(int i = 0; i<str.length; i++){
                cars.put(str[i], 1);
            }
            return cars;
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    //시도횟수 입력 메소드
    public static int readTryCount(){
        System.out.println("시도할 횟수는 몇회인가요?");
        int count = scanner.nextInt();
        scanner.nextLine();
        return count;
    }

}
