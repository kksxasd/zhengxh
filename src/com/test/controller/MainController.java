package com.test.controller;

import com.mysql.jdbc.Blob;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import com.test.dao.ResponseInfoBody;
import com.test.entity.Cardinfo;
import com.test.entity.IndexMenu;
import com.test.service.AlgorithmService;
import com.test.service.CardinfoServcie;
import com.test.service.IndexMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageOutputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.SQLException;
import java.util.List;
import oracle.sql.BLOB;

/**
 * Created by Administrator on 2017/6/2.
 */
@Controller
@RequestMapping(value = "/main")
public class MainController {
    @Autowired
    private IndexMenuService indexMenuService;
    @Autowired
    private CardinfoServcie cardinfoServcie;

    @RequestMapping()
    public String index(Model model, HttpServletRequest request, HttpServletResponse response) {
        List<IndexMenu> indexParentMenus = indexMenuService.getParentMenu();
        model.addAttribute("indexParentMenus", indexParentMenus);
        return "/index";
    }

    @RequestMapping("/goAlgorithm")
    public String nextPage(HttpServletRequest request, HttpServletResponse response) {
        return "/algorithmPage";
    }

    @RequestMapping("getChildrenMenu")
    @ResponseBody
    public List<IndexMenu> getChildrenMenu(@RequestParam("parentId") Long parentId) {
        List<IndexMenu> indexChildrenMenus = indexMenuService.getChildrenMenu(parentId);
        return indexChildrenMenus;
    }


    @RequestMapping("/gobang")
    public String gobang(HttpServletRequest request, HttpServletResponse response) {
        return "/gobang";
    }

    @RequestMapping("/file")
    public String filePage(HttpServletRequest request, HttpServletResponse response) {
        return "/file";
    }

    @RequestMapping("/getPhone")
    public void getPhone(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {

        List<Cardinfo> cardinfos = cardinfoServcie.getPhone();
        byte[] blob = cardinfos.get(0).getPhoto();
        String str=new String(blob);
        String s1="d:\\b.jpg";
        File file2 = new File(s1);
        OutputStream outputStream = new FileOutputStream(file2);
        try {
            outputStream.write(blob);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("setPhoto")
    public void setPhoto() throws IOException {
        File image = new File("D:/bb.jpg");
        FileInputStream fis=new FileInputStream(image);
        byte[]   data   =   new   byte[fis.available()];
        fis.read(data);
        fis.close();
        cardinfoServcie.setPhoto(data);
        int a=10;
    }
}
