package cn.cultivator.chainOfResp;

public class GeneralManager extends Leader{

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest lr) {
		if(lr.getDay()<30){
			System.out.println("请假人:"+lr.getName()+",请假天数:"+lr.getDay()+",请假原因："+lr.getReason());
			System.out.println("总经理:"+this.name+",审核通过.");
		}else{
			if(this.nextLeader!=null){
				this.nextLeader.handleRequest(lr);
			}
		}
	}

}
