package com.example.controller;

import com.example.model.Restaurant;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/restaurants")
public class RestaurantController extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // 데이터베이스에서 식당 정보를 가져오는 로직
        List<Restaurant> restaurants = getRestaurants();
        
        // JSP에서 사용할 수 있도록 request에 데이터 설정
        request.setAttribute("restaurants", restaurants);
        
        // JSP 페이지로 포워딩
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/restaurants.jsp");
        dispatcher.forward(request, response);
    }
    
    private List<Restaurant> getRestaurants() {
        // 여기에 실제 데이터베이스 조회 로직 구현
        // 예시 데이터
        List<Restaurant> restaurants = new ArrayList<>();
        Restaurant restaurant = new Restaurant();
        restaurant.setId(1L);
        restaurant.setName("대전맛집");
        restaurant.setCategory("한식");
        restaurant.setAddress("서울시 강남구");
        restaurant.setLat(37.5665);
        restaurant.setLng(126.9780);
        restaurant.setRating(4.5);
        restaurant.setReviewCount(100);
        restaurant.setImageUrl("/images/restaurant1.jpg");
        restaurants.add(restaurant);
        
        return restaurants;
    }
}
