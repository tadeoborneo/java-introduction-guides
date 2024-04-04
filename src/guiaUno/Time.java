package guiaUno;

public class Time {

    private Integer hour;
    private Integer minute;
    private Integer second;

    public Time(Integer hour, Integer minute, Integer second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void printHour() {
        System.out.println(this.hour + ":" + this.minute + ":" + this.second);
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public Time addSecond() {
        this.second++;
        if (this.second == 60) {
            this.second = 0;
            this.minute++;
            if (this.minute == 60)
            {
                this.minute = 0;
                this.hour++;
                if (this.hour == 24) {
                    this.hour = 0;
                }
            }
        }
        return this;
    }

    public Time subtractSecond(){
        this.second--;
        if(this.second < 0)
        {
            this.second = 59;
            this.minute--;
            if (this.minute < 0){
                this.minute = 59;
                this.hour--;
                if (this.hour < 0)
                    this.hour = 23;
            }
        }
        return this;
    }
}



