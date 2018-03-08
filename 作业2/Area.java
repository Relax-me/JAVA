package 作业2;
//3、	定义一个类Area，通过方法重载分别计算出三角形、圆、梯形的面积和周长。
public class Area {
	public Area(){
	}
	double  area(double bottom,double height){//三角形
		return bottom*height/2;
	}
	double  area(double radium){//圆
		return radium*radium*3.1415926;
	}
	double  area(double Tbottom,double Bbottom,double height){//梯形
		return (Tbottom+Bbottom)*height/2;
	}
}
