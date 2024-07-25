package net.media.training.live.srp;

public class Leaves {
    private static int TOTAL_LEAVES_ALLOWED = 30;
    private int yearsInOrg;
    private int thisYear;
    private int[] leavesLeftPreviously;

    private int leavesTaken;
    private int totalLeaveAllowed;
    private int leaveTaken;

    public int getLeavesTaken() {
        return leavesTaken;
    }

    public int getTotalLeaveAllowed() {
        return totalLeaveAllowed;
    }

    public int getLeaveTaken() {
        return leaveTaken;
    }


    public int getYearsInOrg() {
        return yearsInOrg;
    }

    public int getThisYear() {
        return thisYear;
    }

    public int[] getLeavesLeftPreviously() {
        return leavesLeftPreviously;
    }

    public void setLeavesTaken(int leavesTaken) {
        this.leavesTaken = leavesTaken;
    }

    public void setTotalLeaveAllowed(int totalLeaveAllowed) {
        this.totalLeaveAllowed = totalLeaveAllowed;
    }

    public void setLeaveTaken(int leaveTaken) {
        this.leaveTaken = leaveTaken;
    }

    public void setYearsInOrg(int yearsInOrg) {
        this.yearsInOrg = yearsInOrg;
    }

    public void setThisYear(int thisYear) {
        this.thisYear = thisYear;
    }

    public void setLeavesLeftPreviously(int[] leavesLeftPreviously) {
        this.leavesLeftPreviously = leavesLeftPreviously;
    }



    Leaves(int[] leavesLeftPreviously,int leavesTaken){

        this.leavesLeftPreviously=leavesLeftPreviously;
        this.leavesTaken=leavesTaken;
    }

    public int getTotalYears(){
        int years = 3;
        if (yearsInOrg < 3) {
            years = yearsInOrg;
        }
        return years;
    }
    public int getTotalLeaveLeftPreviously(){
        int years=getTotalYears();
        int totalLeaveLeftPreviously=0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += getLeavesLeftPreviously()[yearsInOrg-i-1];
        }
        return totalLeaveLeftPreviously;
    }


}
