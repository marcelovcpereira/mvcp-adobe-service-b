package adobe.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequestMapping("/")
@RestController
public class Entrypoint {
    public static final Logger logger = (Logger) LoggerFactory.getLogger(Entrypoint.class);

    @GetMapping("/marcelo/serviceb/{id}")
    public @ResponseBody
    Object get(@PathVariable("id") String id) {
        return "{\"idServiceB\": " + id + "}";
    }

    @PutMapping("/marcelo/serviceb/put")
    public @ResponseBody Object put(@RequestBody Map<String, String> body) {
        String ret = "{ \"service\": \"B\",";
        for (String key : body.keySet()) {
            String value = body.get(key);
            ret += "\"" + key + "\": \"" + value + "\",";
        }
        ret = ret.substring(0,ret.length()-1);
        ret += "}";
        return ret;
    }
}