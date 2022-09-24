package kr.ac.mongtons.college_support_fees.controller;

import kr.ac.mongtons.college_support_fees.domain.entity.Pay_List;
import kr.ac.mongtons.college_support_fees.domain.repository.Pay_ListRepository;
import kr.ac.mongtons.college_support_fees.dto.Pay_ListForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    Pay_ListRepository plr;
    @GetMapping("/main")
    public String mainPage(Model model){
        List<Pay_List> entity=plr.findAll();
        model.addAttribute("entityList", entity);
        return "main";
    }
    @PostMapping("/search/post")
    public String postSearch(Pay_ListForm plf, Model model){
        System.out.println(plf.toString());
        List<Pay_List> nameEntity=plr.findAll();
        List<Pay_List> attribute=new ArrayList<Pay_List>();
        List<Pay_List> att=new ArrayList<>();
        for(Pay_List pl:nameEntity){
            if(pl.num==plf.getNum()) {
                attribute.add(pl);
            }
        }
        if(!(plf.getName().equals(""))){
            for(int i=0; i<attribute.size(); i++){
                if(attribute.get(i).name.equals(plf.getName()))
                    att.add(attribute.get(i));
            }
            model.addAttribute("entityList", att);
        }else
            model.addAttribute("entityList", attribute);
        return "search";
    }
    @GetMapping("/search")
    public String searchPage(){
        return "search";
    }
}
