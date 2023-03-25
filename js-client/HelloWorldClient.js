const soap = require('soap');

const url = 'http://x-wing123:8080/WebServicesGlass/HelloWorldImplService?wsdl';

soap.createClient(url, (err, client) => {
    if (err) {
        console.error(err);
    } else {
        client.produkty({}, (err, result) => {
            if (err) {
                console.error(err);
            } else {
                console.log(result);
            }
        });

        client.getHelloWorldAsString({ name: "Filip" },(err, res) => {
            console.log(res)
        })
    }
});

