/**
 * @return {Function}
 */
//var createHelloWorld = function() {
    
   // return function(...args) {
        
  //  }
//};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */
function createHelloWorld() {
    // Return a function that always returns "Hello World"
    return function() {
        return "Hello World";
    };
}
