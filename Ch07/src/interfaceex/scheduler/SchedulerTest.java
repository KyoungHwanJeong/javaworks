	/*
	 * 상담원 배분하기.
	 * =====================================
	 * 전화 상담 배분 방식을 선택하세요.
	 * R 또는 r: 한명씩 차례대로 배분
	 * L 또는 l: 쉬고 있거나 대기가 가장 적은 상담원에게 배분
	 * P 또는 p: 우선 순위가 높은 고객에게 먼저 배분
	 * =====================================
	 * 
	 * Scheduler 인터페이스는 다음 전화를 가져오는 getNextCall과
	 * 상담원을 배분하는 sendCallToAgent로 구성 되어 있고,
	 * R=RoundRobin, L=LeastJob, P=PriorityAllocation이고,
	 * 각각 Scheduler의 상속을 받는다.
	 * 
	 * 1. RoundRobin 방식
	 * 	getNextCall = "상담전화를 순서대로 가져오기"
	 * 	sendCallToAgent = "다음 순서 상담원에게 배분합니다."
	 * 2. LeastJob 방식
	 *  getNextCall = "상담전화를 순서대로 가져오기"
	 *  sendCallToAgent = "현재 상담업무가 없거나 대기가 적은 상담원에게 연결됩니다."
	 * 3. PriorityAllocation 방식
	 *  getNextCall = "고객 등급이 높은 고객의 전화를 먼저 가져오기"
	 *  sendCallToAgent = "업무 스킬이 높은 상담원에게 우선 배분합니다."
	 *  
	 *  한 문자를 입력 받아 전화 상담 기능 구현하기.
	 * 
	*/

package interfaceex.scheduler;

import java.io.IOException;

public class SchedulerTest {
	
	public static void main(String[] args) throws IOException {

		// 인터페이스형으로 다형성 구현
/*
		Scheduler scheduler = new LeastJob();
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
*/
		System.out.println("=====================================");
		System.out.println("전화 상담 배분 방식을 선택하세요.");
		System.out.println("R: 한명씩 차례대로 배분");
		System.out.println("L: 쉬고 있거나 대기가 가장 적은 상담원에게 배분");
		System.out.println("P: 우선 순위가 높은 고객에게 먼저 배분");
		System.out.println("=====================================");

		// 한 문자 입력 메서드 - char이지만 int를 사용한다.(코드값 사용)
		int ch= System.in.read();
		Scheduler scheduler = null;
		
		if(ch == 'R'|| ch =='r') {	// int형이므로 동등비교(==) 연산자 사용
			scheduler = new RoundRobin();
		}else if(ch == 'L'|| ch =='l') {
			scheduler = new LeastJob();
		}else if(ch == 'P'|| ch =='p') {
			scheduler = new PriorityAllocation();
		}else {
			System.out.println("지원되지 않는 기능입니다.");
			//return;
			System.exit(0);	// 프로그램 즉시 종료
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
