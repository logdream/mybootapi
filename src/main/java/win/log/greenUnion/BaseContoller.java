package win.log.greenUnion;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import win.log.base.Result;
import win.log.greenUnion.model.BaseModel;

public  class BaseContoller<T extends BaseModel<T>> {

	

	@ApiOperation("添加")
	public Result<T> add(@RequestBody T t) {
		Result<T> result = new Result<T>();
		result.setData(t);
		return result;
	}

	public Result<String> delete(String id) {
		return new Result<String>(true);
	}

	@ApiOperation("修改")
	public Result<T> update(@RequestBody T t) {
		Result<T> result = new Result<T>();
		result.setData(t);
		return result;
	}

	@ApiImplicitParams({ @ApiImplicitParam(name = "page", value = "当前页码", required = true, dataType = "int"),
			@ApiImplicitParam(name = "rows", value = "每页条数", required = true, dataType = "int") })
	public Page<T> list(@RequestParam(name = "page", defaultValue = "1") int page,
			@RequestParam(name = "rows", defaultValue = "10") int rows,
			@RequestParam(name = "searchs") String searchs) {
		//T t = getModel();
		return null;
	}

}
