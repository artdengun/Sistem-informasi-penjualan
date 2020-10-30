/**
 * 
 */

$('document').ready(function() {
	
	$('.table .btn-primary').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(pemasok, status){
			$('#id_pemasokEdit').val(pemasok.id_pemasok);
			$('#nama_pemasokEdit').val(pemasok.nama_pemasok);
			$('#alamat_pemasokEdit').val(pemasok.alamat_pemasok);
			$('#telephone_pemasokEdit').val(pemasok.telephone_pemasok);
			$('#email_pemasokEdit').val(pemasok.email_pemasok);
		});			
		$('#editModal').modal();		
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();
		var href= $(this).attr('href');
		$.get(href, function(pemasok, status){
			$('#id_pemasokDetails').val(pemasok.id_pemasok);
			$('#nama_pemasokDetails').val(pemasok.nama_pemasok);
			$('#alamat_pemasokDetails').val(pemasok.alamat_pemasok);
			$('#telephone_pemasokDetails').val(pemasok.telephone_pemasok);
			$('#email_pemasokDetails').val(pemasok.email_pemasok);
			$('#lastModifiedByDetails').val(pemasok.lastModifiedBy);
            $('#lastModifiedDateDetails').val(pemasok.lastModifiedDate.substr(0,19).replace("T", " "));
				});
		$('#detailsModal').modal();
	});
	
	$('.table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);
		$('#deleteModal').modal();		
	});	
});