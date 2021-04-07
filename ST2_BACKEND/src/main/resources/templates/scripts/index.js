
function AJAXCALL()
{
    var xhttp = new XMLHttpRequest();
    xhttp.open("POST", "http://localhost:8080/trying", true);
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200)
        {
                   var Name=document.getElementById("Name").value;
                    var mob_no=document.getElementById("mob_no").value;
                    var email=document.getElementById("email").value;

                      var json={
                          "name":Name,
                          "mobile_no":mob_no,
                          "email":email,
                      };

        }
    };

    xhttp.send(JSON.stringify(json));
}






