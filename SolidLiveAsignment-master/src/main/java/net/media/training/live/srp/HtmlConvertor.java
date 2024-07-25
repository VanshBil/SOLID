package net.media.training.live.srp;

public class HtmlConvertor {
    public String toHtml(Employee e) {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + e.getEmpId() + "'>" +
                "<span>" + e.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (e.getLeaves().getTotalLeaveAllowed() - e.getLeaves().getLeaveTaken()) + "</span>";
        str += "<span>" + Math.round(e.getMonthlySalary() * 12) + "</span>";
        if (e.getManager() != null) str += "<span>" + e.getManager() + "</span>";
        else str += "<span>None</span>";
        int totalLeaveLeftPreviously = e.getLeaves().getTotalLeaveLeftPreviously();
        str += "<span>" + totalLeaveLeftPreviously + "</span>";
        return str + "</div> </div>";
    }
}
