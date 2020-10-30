/**
 * 
 */

$('document').ready(function() {
	
	$('.table .btn-primary').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(barang, status){
			$('#id_barangEdit').val(barang.id_barang);
			$('#nama_barangEdit').val(barang.nama_barang);
			$('#gambarEdit').val(barang.gambar);
			$('#keterangan_barangEdit').val(barang.keterangan_barang);
		});
		$('#editModal').modal();
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();
		var href= $(this).attr('href');
		$.get(href, function(barang, status){
			$('#id_barangDetails').val(barang.id_barang);
			$('#nama_barangDetails').val(barang.nama_barang);
			$('#gambarDetails').val(barang.gambar);
			$('#keterangan_barangDetails').val(barang.keterangan_barang);
			$('#lastModifiedByDetails').val(barang.lastModifiedBy);
            $('#lastModifiedDateDetails').val(barang.lastModifiedDate.substr(0,19).replace("T", " "));
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