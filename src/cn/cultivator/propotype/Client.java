package cn.cultivator.propotype;

import java.util.Date;

/**
 * ����ǳ����
 * s1��s2 ��birthday ��ָ����ͬһ������ ���Ըı�s1��ֵ��ͬʱ�ı��¡����s2��ֵ
 * ����˵���Ƶ���һ�ݶ�������� �����õ�ַҲ�����˹�ȥ��
 * @author Hickey
 *
 */
public class Client {
	public static void main(String[] args) throws Exception {
		Sheep s1 = new Sheep();
		Date date = new Date(64654646L);
		s1.setBirthday(date);
		s1.setName("����");
		//�޸ı���¡��������� ǳ���ƵĻ� ��¡����Ҳ��ı�
		System.out.println(s1.getBirthday());
		System.out.println(s1);
		Sheep s2 = (Sheep) s1.clone();
		System.out.println(s2);
		date.setTime(4545454L);
		System.out.println(s1.getBirthday());
		System.out.println(s2.getBirthday());
		System.out.println(s1==s2);
	}
}
