package com.via_java;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.via_implicing_wiring")
@ImportResource("classpath:config.xml")
public class ConfigApp {

    @Bean
    public Ballable ball() {
        return new Ball();
    }

    @Bean
    @Primary
    public Ballable fun() {
        return new Fun();
    }

    @Bean
    @Scope("prototype")
    public Tree tree() {
        return new Tree("Oaksssdsdasdas");
    }

    @Bean
    public Tree tree1() {
        return new Tree("Oak1");
    }

    @Bean("fir")
    @Primary
    @Scope("prototype")
    public Leaf leaf() {
        return new Leaf(tree());
    }

    @Bean("gun")
    @Scope("prototype")
    //@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Leaf leaf(Tree tree1, Ballable ballable) {
        return new Leaf(tree1, ballable);
    }
}
