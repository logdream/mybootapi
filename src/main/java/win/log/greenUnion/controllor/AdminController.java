package win.log.greenUnion.controllor;

import java.util.Random;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import win.log.base.Result;
import win.log.greenUnion.model.Admin;

@RestController
@RequestMapping("/api/admin")
@Api(value = "用户服务")
public class AdminController {
	
	private Admin get(String id){
		Admin ad = new Admin();
		ad =  ad.newInstance();
		ad.setId(id);
		return ad;
	}
	
	@GetMapping("/resetpw/{id}")
	 @ApiOperation("重置密码")
	public Result<String> restPw(@PathVariable String id){
		return new Result<String>(new Random().nextBoolean());
	}
	
	@PostMapping("/add")
    @ApiOperation("添加")
    public Result<Admin>  add(@RequestBody Admin t) {
		Result<Admin> res = new Result<>(true);
		t.setId(UUID.randomUUID().toString());
		res.setT(t);
		return res;
    }

	@DeleteMapping("/delete")
	public Result<Boolean> delete(String id){
		return new Result<>(true);
	}
	@PostMapping("/update")
    @ApiOperation("修改")
    public Result<Admin>  update(@RequestBody Admin t) {
        Result<Admin> result = new Result<Admin>();
        result.setT(t);
        return result;
    }
	@GetMapping("/disable/{id}")
	@ApiOperation("禁用")
	public Result<Admin> disable(@PathVariable String id){
	     Result<Admin> result = new Result<Admin>(true);
	     Admin t = (get(id));
	     t.setState("0");
	     result.setT(t);
		return result;
	}
	
	
	
	@GetMapping("/enable/{id}")
	@ApiOperation("起用")
	public Result<Admin> enable(@PathVariable String id){
		 Result<Admin> result = new Result<Admin>(true);
		 Admin t = (get(id));
	     t.setState("1");
	     result.setT(t);
		return null;
	}
	@PostMapping("/list")
	@ApiOperation("查询")
	public Page<Admin> list(){
		return null;
	}

}
