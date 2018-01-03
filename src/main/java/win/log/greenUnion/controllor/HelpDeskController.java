package win.log.greenUnion.controllor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import win.log.base.GuPlainModel;
import win.log.base.GuRequest;
import win.log.base.GuResult;
import win.log.greenUnion.model.HelpDesk;

@RestController
@RequestMapping("/api/helpDesk")
public class HelpDeskController {

	@PostMapping("/list")
	@ApiOperation("查询")
	public GuResult<HelpDesk> list(@ModelAttribute GuRequest request){
		HelpDesk helpDesk = new HelpDesk();
		Integer pageIndex = Integer.parseInt(request.getPageIndex());
		Integer pageSize = Integer.parseInt(request.getPageSize());
		return helpDesk.prepareGuPage(pageIndex, pageSize);
		
	}
	
	@GetMapping("/deleteOne")
	@ApiOperation("删除")
	public GuResult<String> deleteOne(String id){
		return new GuResult<String>();
	}
	
	@GetMapping("/get")
	public GuPlainModel<HelpDesk> get(String id){
		HelpDesk helpDesk = new HelpDesk();
		helpDesk = helpDesk.newInstance();
		helpDesk.setId(id);
		return new GuPlainModel<HelpDesk>(helpDesk);
	}
	
	@PostMapping("/add")
	public GuResult<String> saveOne(@ModelAttribute HelpDesk helpDesk){
		return new GuResult<String>();
	}
	@PostMapping("/update")
	public GuResult<String> updateOne(@ModelAttribute HelpDesk helpDesk){
		return new GuResult<String>();
	}
	
	@GetMapping("/setState")
	@ApiOperation("设置状态")
	public GuResult<String> deleteOne(String id,String state){
		return new GuResult<String>();
	}
}
