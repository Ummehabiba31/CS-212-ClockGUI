
public class Clock {
private int hour;
private int minute;
private int second;


//setter methods for private variables
void setHour(int hour) {
	this.hour = hour;
}
void setMinute(int minute) {
	this.minute = minute;
}
void setSecond(int second) {
	this.second = second;
}

//getter methods for the private variables
int getHour() {
	return hour;
}

int getMinute() {
	return minute;
}
int getSecond() {
	return second;
}

//setting a three argument constructor
public Clock(int hour, int minute, int second) {
	this.hour = hour;
	this.minute = minute;
	this.second = second;
}




//overriding the method toString which will return everything in string.
public String toString() {
	String str= hour + ":";
	if(minute<10) {
		str += "0"+ minute + ":";
	}
	else {
		str += minute + ":";
	}
	
	if(second <10) {
		str += "0"+ second ;
	}
	else {
		str+= second;
	}
	return str;	
}

}
