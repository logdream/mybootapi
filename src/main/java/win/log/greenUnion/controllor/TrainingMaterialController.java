package win.log.greenUnion.controllor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import win.log.base.GuPlainModel;
import win.log.base.GuRequest;
import win.log.base.GuResult;
import win.log.greenUnion.model.TrainingMaterial;

@RestController
@RequestMapping("/api/trainingMaterial")
public class TrainingMaterialController {
	private static String tempContent;
	@PostMapping("/list")
	@ApiOperation("查询")
	public GuResult<TrainingMaterial> list(@ModelAttribute GuRequest request){
		TrainingMaterial helpDesk = new TrainingMaterial();
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
	public GuPlainModel<TrainingMaterial> get(String id){
		TrainingMaterial helpDesk = new TrainingMaterial();
		helpDesk = helpDesk.newInstance();
		helpDesk.setId(id);
		if(null==tempContent){
			 try {
				tempContent =  FileUtils.readFileToString(new File("d:\\a.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		helpDesk.setContent(tempContent);
		return new GuPlainModel<TrainingMaterial>(helpDesk);
	}
	
	@PostMapping("/add")
	public GuResult<String> saveOne(@ModelAttribute TrainingMaterial helpDesk){
		return new GuResult<String>();
	}
	@PostMapping("/update")
	public GuResult<String> updateOne(@ModelAttribute TrainingMaterial helpDesk){
		return new GuResult<String>();
	}
	
	@GetMapping("/setState")
	@ApiOperation("设置状态")
	public GuResult<String> deleteOne(String id,String state){
		return new GuResult<String>();
	}
}
