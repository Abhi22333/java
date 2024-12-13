package com.xworkz.forms.component;

import com.xworkz.forms.dto.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Forms {
    Forms(){
        System.out.println("running No args forms const");
    }
    @RequestMapping("scholarship")
    public  String applyScholarship(ScholarshipDTO scholarshipDTO){
        System.out.println("running applyScholarship");
        System.out.println(scholarshipDTO);
        return "scholarshipform.jsp";
    }
    @RequestMapping("job")
    public  String applyJob(JobDTO jobDTO){
        System.out.println("running applyJob");
        System.out.println(jobDTO);
        return "job.jsp";
    }
    @RequestMapping("organ")
    public  String donateOrgan(OrganDonationDTO organDonationDTO){
        System.out.println("running donateOrgan");
        System.out.println(organDonationDTO);
        return "organdonation.jsp";
    }
    @RequestMapping("matrimony")
    public  String applyMatrimony(MatrimonyDTO matrimonyDTO){
        System.out.println("running MatrimonyDTO");
        System.out.println(matrimonyDTO);
        return "matrimony.jsp";
    }
    @RequestMapping("hotel")
    public String bookHotelRoom(HotelRoomDTO hotelRoomDTO){
        System.out.println("running bookHotelRoom");
        System.out.println(hotelRoomDTO);
        return "hotelroom.jsp";
    }

}
