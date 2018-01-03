package win.log.greenUnion.controllor;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import win.log.base.Result;
import win.log.greenUnion.model.Admin;
import win.log.greenUnion.model.Token;

@RestController
@RequestMapping("/api/auth")
@Api(value = "登陆服务")
public class LoginController {
	@ApiOperation(value="登陆结果，25%随机返回失败")
	@PostMapping("/login")
	public Result<Token> login(String account,String password){
		Integer into = new Random().nextInt(20);
		if(into<15){
		Result<Token> token = new Result<>(true);
				token.setData(new Token(account));
				return token;
		}
		else{
			Result<Token> token = new Result<>(false);
			token.setDesc("验证失败");
			return token;
		}
	}
	@ApiOperation(value="更新密码")
	@PostMapping("/renewpw")
	public Result<Token> renewpw(String oldpw,String newpw){
		Integer into = new Random().nextInt(20);
		if(into<15){
		Result<Token> token = new Result<>(true);
				token.setData(new Token("admin"));
				return token;
		}
		else{
			Result<Token> token = new Result<>(false);
			token.setDesc("验证失败");
			return token;
		}
		
	}
	
	@ApiOperation(value="验证是否登陆,在访问需要授权的页面会访问此方法25%失败")
	@GetMapping("/verify")
	public Result<Admin> verify(@RequestHeader(name="Authorization")String bearer ){
		Integer into = new Random().nextInt(20);
		Admin admin = new Admin();
		if(into<15){
			Result<Admin> aResult = 	new Result<Admin>(true);
			aResult.setData(admin.newInstance());
		return  aResult;
		}
		else{
			return  new Result<Admin>(false);
		}
	}
	
	
	
}
