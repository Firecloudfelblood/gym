$(document).ready(()=>{
    $(".custSelected").click(()=>{

       $("#id").val($("input[name='custSelected']:checked").parent().next('td').text());
       $("#buscar").trigger("click");
    });
});