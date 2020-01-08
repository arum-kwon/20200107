package co.arum.lotto;
//메인에서 금액만 입력하면 끝나는 구조로.


public class Lotto {

	private int count; //반복 출력하는 횟수 결정
	private int[] numAry; //번호를 담을 배열
	
	public void randomSelect(int money) {
		count = money/1000;
		numAry = new int[6];
		
		System.out.println("------------------------");
		
		for(int c=0 ; c<count ; c++) {
			for(int i=0; i<numAry.length ; i++) {
				boolean run = true;
				restart : while(run) {
					int num = (int)(Math.random()*45+1);//번호 랜덤 추출
					for(int j=0 ; j<i ; j++) { //중복확인
						if(num==numAry[j]) {
							break restart; //중복이면 숫자 다시 뽑기 i--로 대처
						}
					}
					numAry[i] = num; //번호 저장
					run = false;
				}
			}
			//순차로 재배열 Arrays.sort(arrays_name);
			int countAry;
			do{
				countAry = 0;
				for(int i=0; i<numAry.length-1 ; i++) {
					if(numAry[i] > numAry[i+1]) { //앞의 자리 숫자가 뒷 자리 숫자보다 크면 서로 자리바꿈
						int temp = numAry[i+1];
						numAry[i+1] = numAry[i];
						numAry[i] = temp;
					}else {
						countAry++;
					}
					
				}
			}while(countAry < (numAry.length-1));
			
			for(int n : numAry) { //출력
				System.out.print(String.format("%3d", n) + " ");
			}
			System.out.println();
		}
		System.out.println("------------------------");
	}
	
	
	
}
