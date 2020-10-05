package com.example.demo;

import java.util.List;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

// 파일명 : com/demo/pojo/FruitProperty.java
@Data
//@ConfigurationProperties를 사용하려면 component선언을 해서 의존성 주입이 가능하게 만들어야 함.
@Component 
//접두사가 fruit인 프로퍼티키값을 읽어와서 필드값에 매핑함.
//application.yml이 아닌 다른 이름의 yaml파일을 사용할때는 (prefix ="fruit")로 사용.
@ConfigurationProperties("fruit")
public class FruitProperty{
	private List<Map> list;
	/*pojo 매핑 방법
 	private List<Fruit> list;
 	==> 아래의 코드들도 모두 <Map>을 <Fruit>로 바꿔주자! 
 */
	public List<Map> getList() {
		return list;
	}

	public void setList(List<Map> list) {
		this.list = list;
	}
	
}