package ��ҵ2;
//3��	����һ����Area��ͨ���������طֱ����������Ρ�Բ�����ε�������ܳ���
public class Area {
	public Area(){
	}
	double  area(double bottom,double height){//������
		return bottom*height/2;
	}
	double  area(double radium){//Բ
		return radium*radium*3.1415926;
	}
	double  area(double Tbottom,double Bbottom,double height){//����
		return (Tbottom+Bbottom)*height/2;
	}
}
