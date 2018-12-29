package org.spring.springboot.controller;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.dao.BookDao;
import org.spring.springboot.domain.Book;
import org.spring.springboot.domain.City;
import org.spring.springboot.entity.BaseResult;
import org.spring.springboot.entity.RequestState;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * Created by xchunzhao on 02/05/2017.
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;
    @Autowired
    private BookDao bookDao;

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        return cityService.findCityByName(cityName);
    }

    @GetMapping(value = "/api/allCitys")
    public BaseResult listAllCity(){
        List<City> cities = cityService.getAllCities();
        BaseResult result = new BaseResult();
        result.setData(cities);
        result.setSize(cities.size());
        result.setInfo("");
        result.setStatus(RequestState.SUCCESS);

        return result;
    }

    @GetMapping(value = "book/{id}")
    public BaseResult getBookByName(@PathVariable String id){
        Book book = bookDao.getBookByName(id);
        BaseResult baseResult = new BaseResult();
        if (book == null){
            baseResult.setStatus(RequestState.FAIL);
            baseResult.setInfo("没有该项");
        }else {
            baseResult.setStatus(RequestState.SUCCESS);
            baseResult.setData(book);
        }

        return baseResult;
    }

    @GetMapping(value = "/book/all")
    public List<Book> listAllBooks(){
        return bookDao.listAll();
    }

    @PostMapping(value = "/book/add")
    public BaseResult addBook(@ModelAttribute Book book){
        BaseResult baseResult = new BaseResult();
        try {
            bookDao.insertBook(book);
            baseResult.setStatus(RequestState.SUCCESS);
        } catch (Exception e) {
           baseResult.setInfo("保存数据失败");
           baseResult.setStatus(RequestState.FAIL);
        }

        return baseResult;
    }

}
