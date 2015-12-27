package cn.cultivator.chainOfResp;

public class Director extends Leader{

	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest lr) {
		if(lr.getDay()<3){
			System.out.println("请假人:"+lr.getName()+",请假天数:"+lr.getDay()+",请假原因："+lr.getReason());
			System.out.println("主任:"+this.name+",审核通过.");
		}else{
			if(this.nextLeader!=null){
				this.nextLeader.handleRequest(lr);
			}
		}
	}

}
