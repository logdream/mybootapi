package win.log.greenUnion.controllor;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import win.log.base.Result;
import win.log.greenUnion.model.Admin;
import win.log.greenUnion.model.Module;
import win.log.greenUnion.model.Role;

@RestController
@RequestMapping("/api/role")
@Api(value = "角色管理")
public class RoleController {

	@PostMapping("/add")
    @ApiOperation("添加")
    public Result<Role>  add(@RequestBody Role t) {
		t.setId(UUID.randomUUID().toString());
		Result<Role> r = new Result<Role>(true);
		r.setData(t);
		return r;
    }

	@ApiOperation("修改角色")
	@DeleteMapping("/delete")
	public Result<String> delete(String id){
		return new Result<String>(true);
	}
	@PostMapping("/update")
    @ApiOperation("修改")
    public Result<Role>  update(@RequestBody Role t) {
        Result<Role> result = new Result(true);
        result.setData(t);
        return result;
    }
	
	@PostMapping("/list")
	@ApiOperation("查询")
	public Page<Role> list(@RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "size", defaultValue = "15") int rows,
			@RequestParam(name = "searchs",required=false) String searchs,@RequestParam(name="sorts",required=false)String sorts){
		Role role = new Role();
		return role.preparePage(page,rows);
	}
	
	
	@PostMapping("/addAdmin")
	@ApiOperation("增加用户")
	public Result<String> addUser(String roleId,String uid){
		return new Result(true);
	}
	@PostMapping("/removeUser")
	@ApiOperation("移除用户")
	public Result<String> removeUser(String roleId,String uid){
		return new Result(true);
	}
	@ApiOperation("获取角色下用户")
	@GetMapping("/listusers/{id}")
	public List<Admin> listUsers(@PathVariable String id){
		Admin a = new Admin();
		return a.preparePage().getContent();
	}
	
	@ApiOperation(value="获取角色下所有可以配置的模块、权限",notes="需要取得所有可选的module,以及权限，如果当前已勾选，需要ischecked 为真")
	@GetMapping("/listmodule/{id}")
	public List<Module> getRoleModule(@PathVariable String id){
		Module mo = new Module();
		return mo.greatePage(5);
	}
	@ApiOperation(value="移除已经勾选的权限")
	@PostMapping("/removeModule")
	public Result<String> removeModule(@ApiParam(required = true, value = "角色代码")String roleCode,
			@ApiParam(required = true, value = "模块代码")String moduleCode,
			@ApiParam(required = true, value = "权限")String permission){
		return new Result<String>(true);
	}
	
}
