package cn.itcast.haoke.dubbo.api.controller;


import cn.itcast.haoke.dubbo.api.service.PicuploadFileSystemService;
import cn.itcast.haoke.dubbo.api.vo.PicUploadResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("pic/upload")
@Controller
public class PicUploadController {

    @Autowired
    private PicuploadFileSystemService picuploadFileSystemService;

    @PostMapping
    @ResponseBody
    public PicUploadResult upload(@RequestParam("file")MultipartFile uploadFile) throws Exception{
        return this.picuploadFileSystemService.upload(uploadFile);
    }
}
