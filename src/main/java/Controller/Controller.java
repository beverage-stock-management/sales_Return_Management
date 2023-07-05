package Controller;

import Model.Return;
import View.ReturnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    ReturnRepository returnRepository;


    @GetMapping(value = "/return")
    public List<Return> getAllReturns(){
        return returnRepository.findAll();
    }

    @PostMapping(value = "/return")
    public Return addReturn(@RequestBody Return returns){
        return returnRepository.save(returns);
    }

    @GetMapping(value = "/return/{id}")
    public Return getReturnById(@PathVariable int id){
        return returnRepository.findReturnByReturnId(id);
    }

    @PutMapping(value = "/return/{id}")
    public Return update(@PathVariable int id,@RequestBody Return returns){
        returnRepository.deleteById(id);
        return returnRepository.save(returns);
    }

    @DeleteMapping(value = "/return/{id}")
    public void deleteReturns(@PathVariable int id){
        returnRepository.deleteById(id);
    }

}
